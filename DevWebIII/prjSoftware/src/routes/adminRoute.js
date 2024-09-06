const express = require('express')
const router = express.Router()
const adminController = require('../controllers/adminController')

router.get("/admin", adminController.getAdmin)
router.post("/admin/delete", adminController.deleteRegister)

module.exports = router