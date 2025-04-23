const base = {
    get() {
        return {
            url : "http://localhost:8080/zhongxiaoxingcanting/",
            name: "zhongxiaoxingcanting",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhongxiaoxingcanting/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中小型餐厅网站"
        } 
    }
}
export default base
