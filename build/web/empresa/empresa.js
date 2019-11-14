firebase.auth().onAuthStateChanged(function (user) {
    if (user) {
        // User is signed in.

        var user = firebase.auth().currentUser;

        if (user != null) {

            var email_id = user.email;
            var user_id = user.uid;
            document.getElementById("user_para").innerHTML = email_id;
            document.getElementById("user_id").value = user_id;                    
        }

    } else {
        // No user is signed in.            
        window.location.href = "../login/login2.html";
    }
});

function login() {

    var userEmail = document.getElementById("email_field").value;
    var userPass = document.getElementById("password_field").value;
    firebase.auth().signInWithEmailAndPassword(userEmail, userPass).catch(function (error) {
        // Handle Errors here.
        var errorCode = error.code;
        var errorMessage = error.message;
        window.alert("Error : " + errorMessage);
        // ...
    });
}

function logout() {
    firebase.auth().signOut();
}

function getId(id) {
    return document.getElementById(id).value;
}

function limpaCampos(id) {
    return document.getElementById(id).value = "";
}

function arrayJSON(user_id,descricaoProduto, detalheProduto, valorProduto) {
    var data = {
        user_id: user_id,
        descricaoProduto: descricaoProduto,
        detalheProduto: detalheProduto,
        valorProduto: valorProduto        
    };
    return data;
}

function insertProduto() {
    var user_id = getId("user_id");
    var descricaoProduto = getId("descricaoProduto");
    var detalheProduto = getId("detalheProduto");
    var valorProduto = getId("valorProduto");
    
    if (descricaoProduto.length == 0) {
        alert("Descrição do Produto Campo de Preenchimento Obrigatório");
    }
    else if (detalheProduto.length == 0) {
        alert("Detalhe do Produto Campo de Preenchimento Obrigatório");
    }
    else if (valorProduto.length == 0) {
        alert("Valor Produto Campo de Preenchimento Obrigatório");
    }
    else {
        var arrayData = arrayJSON(descricaoProduto, detalheProduto, valorProduto);
        var produto = firebase.database().ref("produto/" + user_id);        
        
        produto.set(arrayData);
        alert("Salvo com Sucesso");

        limpaCampos("descricaoProduto");
        limpaCampos("detalheProduto");
        limpaCampos("valorProduto");        
    }
}
