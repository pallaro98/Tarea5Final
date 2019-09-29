package iteso.mx.tarea05.activities

interface HomeContract {
    interface View {
        fun showProgress()
        fun showInfo()
        fun showNoInfo()
    }

    interface Presenter {
        fun fetchData()
    }
}