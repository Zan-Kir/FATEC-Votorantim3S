const adminModel = require('../models/adminModel')

exports.getAdmin = ((req, res) => {
    let registers = adminModel.getRegisterList()
    res.render('adminView', { registers })
})

exports.deleteRegister = ((req, res) => {
    adminModel.deleteRegister(req.body.email)
    res.redirect('/admin')
})