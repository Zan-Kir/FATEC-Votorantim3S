const swaggerAutogen = require('swagger-autogen')({ openapi: '3.1.0' });

const doc = {
    info: {
        version: '1.0.0',
        title: 'MVC com MongoDB',
        description: 'Projeto MVC com integração ao MongoDB'
    },
    servers: [
        {
            url: 'http://localhost:3000'
        }
    ]
};

const outputFile = './swagger-output.json';
const endpointsFiles = ['./index.js'];

swaggerAutogen(outputFile, endpointsFiles, doc).then(() => {
    require('./');
});