/* global firebase */
// Your web app's Firebase configuration
var firebaseConfig = {
    apiKey: "AIzaSyCi0BC4EL3P74LDHNQILK7vKA9vvIJEozw",
    authDomain: "bdmonitoramento-de7e5.firebaseapp.com",
    databaseURL: "https://bdmonitoramento-de7e5.firebaseio.com",
    projectId: "bdmonitoramento-de7e5",
    storageBucket: "bdmonitoramento-de7e5.appspot.com",
    messagingSenderId: "360369204329",
    appId: "1:360369204329:web:a39208c399d5f2fca906f8"
};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);

function getId(id) {
    return document.getElementById(id).value;
}

function limpaCampos(id) {
    return document.getElementById(id).value = "";
}

function listarEmpresa() {
    var empresa = firebase.database().ref("empresa/");
    empresa.on("child_added", function (data) {
        var empresaValue = data.val();
        console.log(empresaValue.cidade);
    });
}

function arrayJSON(nomeRazao, nomeFantasia, cnpj, inscricaoEstadual, endereco, cidade, estado, telefone, tipoEmpresa, emailEmpresa, senhaEmpresa) {
    var data = {
        nomeRazao: nomeRazao,
        nomeFantasia: nomeFantasia,
        cnpj: cnpj,
        inscricaoEstadual: inscricaoEstadual,
        endereco: endereco,
        cidade: cidade,
        estado: estado,
        telefone: telefone,
        tipoEmpresa: tipoEmpresa,
        emailEmpresa: emailEmpresa,
        senhaEmpresa: senhaEmpresa
    };
    return data;
}

function insertEmpresa() {
    var nomeRazao = getId("nomerazao");
    var nomeFantasia = getId("nomefantasia");
    var cnpj = getId("cnpj");
    var inscricaoEstadual = getId("inscricaoEstadual");
    var endereco = getId("endereco");
    var cidade = getId("cidade");
    var estado = getId("estado");
    var telefone = getId("telefone");
    var tipoEmpresa = getId("tipoEmpresa");
    var emailEmpresa = getId("emailEmpresa");
    var senhaEmpresa = getId("senhaEmpresa");
    if (nomeRazao.length == 0) {
        alert("Nome Razão Campo de Preenchimento Obrigatório");
    } else if (nomeFantasia.length == 0) {
        alert("Nome Fantasia Campo de Preenchimento Obrigatório");
    } else if (cnpj.length == 0) {
        alert("CPNJ Campo de Preenchimento Obrigatório");
    } else if (inscricaoEstadual.length == 0) {
        alert("Incrição Estadual Campo de Preenchimento Obrigatório");
    } else if (endereco.length == 0) {
        alert("Endereço Campo de Preenchimento Obrigatório");
    } else if (cidade.length == 0) {
        alert("Cidade Campo de Preenchimento Obrigatório");
    } else if (estado.length == 0) {
        alert("Estado Campo de Preenchimento Obrigatório");
    } else if (telefone.length == 0) {
        alert("Telefone Campo de Preenchimento Obrigatório");
    } else if (tipoEmpresa.length == 0) {
        alert("Tipo Empresa Campo de Preenchimento Obrigatório");
    } else if (emailEmpresa.length == 0) {
        alert("Email Campo de Preenchimento Obrigatório");
    } else if (senhaEmpresa.length == 0) {
        alert("Senha Campo de Preenchimento Obrigatório");
    } else {
        var arrayData = arrayJSON(nomeRazao, nomeFantasia, cnpj, inscricaoEstadual, endereco, cidade, estado, telefone, tipoEmpresa, emailEmpresa, senhaEmpresa);
        var empresa = firebase.database().ref("empresa/" + nomeFantasia);
        empresa.set(arrayData);
        alert("Salvo com Sucesso");

        limpaCampos("nomerazao");
        limpaCampos("nomefantasia");
        limpaCampos("cnpj");
        limpaCampos("inscricaoEstadual");
        limpaCampos("endereco");
        limpaCampos("cidade");
        limpaCampos("estado");
        limpaCampos("telefone");
        limpaCampos("tipoEmpresa");
        limpaCampos("emailEmpresa");
        limpaCampos("senhaEmpresa");
    }
}

