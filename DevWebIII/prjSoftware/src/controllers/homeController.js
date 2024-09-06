const homeModel = require('../models/homeModel')

exports.getHome = ((req, res) => {
    let cadastro = ''    
    res.render('homeView', { cadastro })
})

exports.saveRegister = ((req, res) => {
    let name = req.body.name
    let email = req.body.email

    if(name && email) {
        homeModel.register(name, email)
        cadastro = '<div class="bg-success p-2 text-white"><p>Cadastro efetuado com Sucesso</p></div>'
        res.render('homeView', { cadastro })
    } else {
        cadastro = '<div class="bg-danger p-2 text-white"><p>Todos os campos devem ser preenchidos</p></div>'
        res.render('homeView', { cadastro })
    }
})