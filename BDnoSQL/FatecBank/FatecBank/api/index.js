import express from 'express'
import cors from 'cors'
import contasRoutes from './routes/contas.js'

const app = express()
const port = 3001

app.use(cors())

app.use(express.json())
app.use('/contas', contasRoutes)
app.listen(port, () => {
    console.log(`🚀 Server running on port ${port}`)
})