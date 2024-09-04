const homeModel = require('../models/homeModel')

exports.getHome = ((req, res) => {
    res.render('homeView')
})

exports.save = ((req, res) => {
    let name = req.body.name
    let email = req.body.email

    if(name && email) {
        homeModel.lista.push(name, email)
    }
})