module.exports = {
    devServer: {
        port:3000,
    /*    proxy: {
            '^/api': {
                target: 'http://localhost:8080/',
                ws: true,
                changeOrigin: true
            }
        }*/
        proxy: 'http://localhost:8080'
    }
}
/*
module.exports = {
    devServer: {
        port: 8081
    }
}*/