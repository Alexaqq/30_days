package com.example.day_30

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.day_30.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TipsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tips = listOf(
            Tip(
                1,
                "Стабильность сна",
                R.drawable.sleep,
                "Ложитесь и вставайте в одно и то же время каждый день, даже в выходные."
            ),
            Tip(
                2,
                "Отказ от гаджетов",
                R.drawable.no_gadgets,
                "Избегайте использования гаджетов за 30-60 минут до сна."
            ),
            Tip(
                3,
                "Комфортная обстановка",
                R.drawable.sleep_environment,
                "Создайте комфортную обстановку в спальне: темнота, прохлада, тишина."
            ),
            Tip(
                4,
                "Отказ от кофеина",
                R.drawable.no_caffeine,
                "Уменьшите потребление кофеина после обеда."
            ),
            Tip(
                5,
                "Оптимальный режим сна",
                R.drawable.sleep_schedule,
                "Найдите свой оптимальный режим сна – экспериментируйте с разной продолжительностью."
            ),
            Tip(
                6,
                "Ритуалы перед сном",
                R.drawable.night_rituals,
                "Введите ритуал перед сном: чтение, медитация, тёплый чай."
            ),
            Tip(
                7,
                "Контроль освещения",
                R.drawable.light_control,
                "Следите за освещением в течение дня – больше солнечного света утром и минимум синего света вечером."
            ),
            Tip(
                8,
                "Отказ от тяжёлой пищи",
                R.drawable.no_heavy_food,
                "Избегайте тяжёлой пищи и алкоголя за 2-3 часа до сна."
            ),
            Tip(
                9,
                "Удобная постель",
                R.drawable.bed,
                "Используйте удобный матрас и подушку, подходящие вам по жёсткости."
            ),
            Tip(
                10,
                "Техники дыхания",
                R.drawable.breathing,
                "Дышите глубоко перед сном, практикуйте дыхательные техники (например, 4-7-8)."
            ),
            Tip(
                11,
                "Ароматерапия",
                R.drawable.aroma,
                "Попробуйте ароматы лаванды или ромашки для расслабления."
            ),
            Tip(
                12,
                "Дневник сна",
                R.drawable.sleep_diary,
                "Ведите дневник сна – записывайте, что влияет на ваш отдых."
            ),
            Tip(
                13,
                "Ограничение дневного сна",
                R.drawable.nap_limit,
                "Старайтесь не спать днём дольше 20-30 минут."
            ),
            Tip(
                14,
                "Если не спится",
                R.drawable.no_force_sleep,
                "Если не можете уснуть за 20 минут – встаньте, займитесь чем-то расслабляющим."
            ),
            Tip(
                15,
                "Утренняя зарядка",
                R.drawable.morning_exercise,
                "Начинайте утро с зарядки или лёгкой физической активности."
            ),
            Tip(
                16,
                "Полезный завтрак",
                R.drawable.breakfast,
                "Завтракайте полезными продуктами, богатыми белками и клетчаткой."
            ),
            Tip(
                17,
                "Планирование дня",
                R.drawable.planning,
                "Планируйте день заранее – создайте расписание на утро."
            ),
            Tip(
                18,
                "Практики осознанности",
                R.drawable.mindfulness,
                "Пробуйте медитацию и осознанные практики для концентрации."
            ),
            Tip(
                19,
                "Гидратация",
                R.drawable.water,
                "Следите за уровнем воды в организме – пейте достаточно жидкости."
            ),
            Tip(
                20,
                "Разделение работы и отдыха",
                R.drawable.work_life_balance,
                "Чередуйте периоды работы и отдыха, используйте технику 'Помодоро'."
            ),
            Tip(
                21,
                "Движение в течение дня",
                R.drawable.movement,
                "Больше двигайтесь в течение дня – короткие прогулки, разминка."
            ),
            Tip(
                22,
                "Ограничение соцсетей",
                R.drawable.no_social,
                "Ограничьте просмотр новостей и соцсетей перед сном."
            ),
            Tip(
                23,
                "Дневник благодарности",
                R.drawable.gratitude,
                "Записывайте 3 позитивные вещи дня в дневник благодарности."
            ),
            Tip(
                24,
                "Цифровой детокс",
                R.drawable.digital_detox,
                "Попробуйте несколько часов без гаджетов ежедневно."
            ),
            Tip(
                25,
                "Хобби для релакса",
                R.drawable.hobby,
                "Займитесь творчеством или любимым хобби для расслабления."
            ),
            Tip(
                26,
                "Позитивные утренние привычки",
                R.drawable.morning_routine,
                "Заводите позитивные утренние привычки: аффирмации, растяжка, музыка."
            ),
            Tip(
                27,
                "Расслабляющие практики",
                R.drawable.relax_practice,
                "Попробуйте йогу, тёплую ванну или чтение перед сном."
            ),
            Tip(
                28,
                "Трекинг сна",
                R.drawable.sleep_tracking,
                "Используйте приложение для отслеживания сна и его анализа."
            ),
            Tip(
                29,
                "Неторопливое утро",
                R.drawable.slow_morning,
                "Не спешите по утрам – выделите время для приятных ритуалов."
            ),
            Tip(
                30,
                "Анализ привычек",
                R.drawable.habit_analysis,
                "Подводите итоги месяца и корректируйте привычки для лучшего самочувствия."
            )
        )

        adapter = TipsAdapter(tips)
        recyclerView.adapter = adapter
    }
}
