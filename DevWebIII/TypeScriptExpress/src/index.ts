import express from 'express';
import userRoutes from './routes/user';
const app = express();

app.use("/api/v1", userRoutes);

app.listen(3000, () =>{
    console.info(`Server is running at Port 3000`);
});