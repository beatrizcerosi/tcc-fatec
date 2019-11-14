/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.controller;

import br.com.projetomonitoramento.DAO.EmpresaDAOImpl;
import br.com.projetomonitoramento.DAO.GenericDAO;
import br.com.projetomonitoramento.DAO.ImagemDAOImpl;
import br.com.projetomonitoramento.model.Empresa;
import br.com.projetomonitoramento.model.Imagem;
import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author PC 03
 */
@WebServlet(name = "CadastrarEmpresa", urlPatterns = {"/CadastrarEmpresa"})
public class CadastrarEmpresa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException {

        String mensagem = "";

        Empresa empresa = new Empresa();
        Imagem imagem = new Imagem();
        List<Imagem> imagems = new ArrayList<>();

        boolean isMultipart = ServletFileUpload.isMultipartContent(request);

        if (isMultipart) {

            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);

            upload.setSizeMax(50 * 1024 * 1024);

            List items = upload.parseRequest(request);

            InputStream is = null;
            Iterator it = items.iterator();

            while (it.hasNext()) {

                FileItem fileItem = (FileItem) it.next();
                if (!fileItem.isFormField()) {
                    is = fileItem.getInputStream();
                    imagem.setImagem(is);
                    imagem.setFile((int) fileItem.getSize());
                    imagem.setPrincipal(false);
                    imagems.add(imagem);
                } else {
                    String dados = fileItem.getFieldName();
                    if (dados.equals("nomerazao")) {
                        empresa.setNomeRazao(fileItem.getString());
                    } 
                    else if (dados.equals("nomefantasia")) {
                        empresa.setNomeFantasia(fileItem.getString());
                    } 
                    else if (dados.equals("cidade")) {
                        empresa.setCidade(fileItem.getString());
                    } 
                    else if (dados.equals("cnpj")) {
                        empresa.setCnpj(fileItem.getString());
                    } 
                    else if (dados.equals("endereco")) {
                        empresa.setEndereço(fileItem.getString());
                    } 
                    else if (dados.equals("estadosbrasil")) {
                        empresa.setEstado(fileItem.getString());
                    } 
                    else if (dados.equals("inscricaoEstadual")) {
                        empresa.setInscricaoEstadual(fileItem.getString());
                    } 
                    else if (dados.equals("telefone")) {
                        empresa.setTelefone(fileItem.getString());
                    } 
                    else if (dados.equals("tipoEmpresa")) {
                        empresa.setTipoEmpresa(fileItem.getString());
                    }                                                                                                                                            
                    else if (dados.equals("emailEmpresa")) {
                        empresa.setEmailEmpresa(fileItem.getString());
                    }                                                                                                                                            
                    else if (dados.equals("senhaEmpresa")) {
                        empresa.setSenhaEmpresa(fileItem.getString());
                    }                                                                                                                                            
                }
            }

            int quantidadeFotos = imagems.size();

            Integer idEmpresa = null;
            try {
                EmpresaDAOImpl dao = new EmpresaDAOImpl();
                idEmpresa = dao.cadastrarEmpresa(empresa); // pega o RETORNO DO ID ProdutoDAO
                if (idEmpresa != null) {// CASO FOR DIFERENTE DE NULO, TENTA CADASTRAR A FOTO

                    for (int cont = 0; cont < quantidadeFotos; cont++) {// CONTA O ARRAY DE FOTOS CRIADO LÁ EM CIMA

                        imagems.get(cont).setCodlink(idEmpresa);
                        imagems.get(cont).setTablink("Empresa");

                        try {
                            GenericDAO daoImagem = new ImagemDAOImpl();
                            if (daoImagem.cadastrar(imagems.get(cont))) {
                                mensagem = "Imagem cadastrado com sucesso!";
                            } else {
                                mensagem = "Problema ao cadastrar Empresa!";
                            }

                        } catch (Exception ex) {
                            System.out.println("Problemas no Servlet ao Cadastrar Foto! Erro: " + ex.getMessage());
                            ex.printStackTrace();
                        }

                    }
                } else {
                    mensagem = "Problema ao cadastrar Empresa!";
                }

                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("index.html").forward(request, response);
            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao Cadastrar Empresa! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(CadastrarEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(CadastrarEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
