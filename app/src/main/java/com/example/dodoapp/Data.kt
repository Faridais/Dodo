package com.example.dodoapp

class DataSource {
    var categories = mutableListOf(
        FoodCategory(1, "Комбо", true),
        FoodCategory(2, "Закуски", false),
        FoodCategory(3, "Напитки", false),
        FoodCategory(4, "Пицца", false),
        FoodCategory(5, "Десерты", false),
        FoodCategory(6, "Соусы", false),
        FoodCategory(7, "Другие товары", false),
    )

    fun getList(category: Int): List<Food> {
        var listOfFood = listOf<Food>()
        when (category) {
            1 -> listOfFood = comboList()
            2 -> listOfFood = snackList()
            3 -> listOfFood = beveragesList()
            4 -> listOfFood = pizzaList()
            5 -> listOfFood = desertsList()
            6 -> listOfFood = comboList()
            7 -> listOfFood = pizzaList()
        }
        return listOfFood
    }

    fun pizzaList(): List<Food> {
        return listOf(
            Food(
                R.drawable.neapolitan_pizza,
                "Neapolitan pizza",
                "Традиционная итальянская пицца, также известная как пицца в неаполитанском стиле, " +
                        "представляет собой пиццу, приготовленную из помидоров и сыра моцарелла.",
                28,
                4,null, "Средняя 30 см, традиционное тесто, 550 гр"
            ),
            Food(
                R.drawable.margherita_pizza, "Margherita pizza", "Неаполитанская пицца, " +
                        "приготовленная из помидоров Сан-Марцано, сыра моцарелла, свежего " +
                        "базилика, соли и оливкового масла первого отжима.", 30, 4, null, "Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.marinara_pizza, "Marinara pizza", "Известная как пицца алла маринара, " +
                        "это стиль неаполитанской пиццы в итальянской кухне приправленный только томатным соусом, " +
                        "оливковым маслом первого холодного отжима, орегано и чесноком", 20, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.sicilian_pizza, "Sicilian pizza", "Традиционная сицилийская пицца " +
                        "также известная как sfincione. Её часто украшают луком, анчоусами, помидорами, травами " +
                        "и сыром, такой как качокавалло и томатами", 31, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.roman_pizza, "Roman pizza", "У Римской пиццы  толстый корж" +
                        "это напоминает хлеб фокачча, нарезанная квадратными ломтиками, обычно подается аль тальо (кусочками)." +
                        " В ней небольшое количество простых, свежих ингредиентов.", 40, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.chicago_deep_dish,
                "Chicago Deep-dish pizza",
                "Чикагская пицца в глубокой тарелке " +
                        "Американская пицца. «Её ингредиенты добавляются в обратном порядке. Моцарелла на дне, мясо " +
                        "(говяжий фарш, колбасы, как правило),» затем овощи, а затем томатный соус, подальше от теста",
                23,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.meat_ball,
                "Meat ball pizza",
                "Пицца с фрикадельками нежные, ароматные фрикадельки нарезаны ломтиками " +
                        "и покрыты слоями свежей моцареллы, сыра пармезан, спагетти и соуса маринара, вдохновленного фрикадельками, " +
                        "в лучшем рецепте пиццы с фрикадельками. Покрыт свежей посыпкой из сыра пармезан",
                25,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.new_york_pizza,
                "New York pizza",
                "Нью-йоркская пицца эта пицца обычно подается с томатным соусом и " +
                        "«Моцарелла. и со многими начинками, такими как сосиски, пепперони, грибы и анчоусы».«Обычно его посыпают хлопьями " +
                        "чили, чесночным порошком, орегано или сыром пармезан.",
                37,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.californian_pizza,
                "Californian pizza",
                "Калифорнийская пицца, также известная как пицца для гурманов," +
                        " она содержит много ингредиентов, часто все ароматные и разные. Содержит сыр рикотта, паштет и красный перцец.",
                40,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.detroit_pizza,
                "Detroit pizza",
                "Детройтская пицца включает такие начинки, как пепперони, сыр» " +
                        "намазывают края пирога, создавая карамелизованную сырную основу, а сверху добавляют томатный соус. Иногда " +
                        "у неё есть лук или оливки.",
                24,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.st_louis_pizza,
                "St. Louis pizza",
                "Сент-Луис пицца. Эта пицца покрыта плавленым сыром" +
                        " Провель (смесь проволоне, чеддера и швейцарского сыра), сладкий томатный соус, ароматизированный " +
                        "много орегано.",
                26,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.canadian_pizza,
                "Canadian pizza",
                "Пицца в канадском стиле готовится с томатным соусом, " +
                        "моцарелла, чеснок, базилик",
                46,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.mexican_pizza,
                "Mexican pizza",
                "Мексиканская пицца это болгарский перец, перец чили, лук, " +
                        "кинза, кукуруза, черная фасоль, помидоры: это самые распространенные начинки для мексиканской пиццы.",
                22,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.south_american_pizza,
                "South American pizza",
                "Южноамериканская пицца Готовится с томатным соусом, " +
                        "моцареллой и различными начинками. Она имеет тонкую корочку и выпекается в дровяной печи",
                23,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.french_pizza,
                "French pizza",
                "Французская пицца это хрустящая корочка, карамелизированный лук, " +
                        "томатный соусом, сыр моцарелло, анчоусы и соленые оливки. ",
                30,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.spanish_pizza,
                "Spanish pizza",
                "Испанская пицца это традиционные местные ингредиенты. " +
                        "Вы можете ожидать ветчину Хамон де Серрано, тапас, чоризо или испанский сыр.",
                32,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.bagel_pizza,
                "Bagel pizza",
                "Бублик пицца является популярным выбором. " +
                        "соус для пиццы тертый сыр моцарелла, вы можете добавить свои любимые начинки",
                33,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.breakfast_pizza,
                "Breakfast pizza",
                "Пицца на завтрак стала популярной» " +
                        "выбор для бранчей выходного дня. Это неудивительно, так как в нем есть бекон, сосиски, яйца, сыр, " +
                        "и даже картошку.",
                31,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.dessert_pizza, "Dessert pizza", "Десертная пицца - сладкая пицца, " +
                        "с шоколадом, нутеллой, карамелью, сливками, арахисовым маслом, орехами, фруктами и любыми " +
                        "сладостями", 41, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.bresaola_pizza,
                "Bresaola pizza",
                "Брезаола — еще одна французская пицца, " +
                        "которую стоит попробовать. Она наполнена томатным соусом, моцареллой, пекорино и брезаолой, " +
                        "итальянской вяленой говяжьей ветчиной», немного похоже на прошутто крудо, только " +
                        "приготовленный из говядины",
                46,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.crudaiola_pizza,
                "Crudaiola pizza",
                "Пицца Крудайола приготовлена с моцареллой" +
                        " и большим количеством овощей, такими как морковь, кабачки, помидоры, маслины. Также приправлены специями " +
                        "например, тимьян, черный перец и оливковое масло.",
                44,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.russian_black_caviar_pizza,
                "Russian Black Caviar pizza",
                "Русская пицца Черная икра" +
                        "Готовится с соусом Thousand Island, Пармиджано Реджано, Черной икрой и укропом",
                50,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.chicken_tikka_masala, "Chicken Tikka Masala", "Чикен тикка масала — " +
                        "Она сделана из томатного соуса, моцареллы, куриной грудки и большого количества трав, приправ и специй. " +
                        "В эту пиццу добавляют тмин, кайенский перец, черный перец, гарам масала, порошок чили, паприку и кориандр. " +
                        "Подается с йогуртом и лимоном.", 46, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.nutella_pizza,
                "Nutella pizza",
                "Пицца Nutella сладкая пицца. Она покрыта Нутеллой " +
                        "и фруктами, обычно клубникой и нарезанным бананом, иногда с добавлением сахарной пудры.",
                40,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.avocado_biltong,
                "Avocado Biltong",
                "Авокадо билтонг — пицца, которую стоит попробовать. " +
                        "Сделанная из острой томатной пасты, сыра, ломтиков авокадо и сухого вяленого мяса, называемого билтонг,",
                30,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.harissa_pizza,
                "Harissa Pizza",
                "Пицца Харисса вместо томатного соуса корочка покрыта пастой" +
                        " из хариссы. После этого идут моцарелла, вяленые оливки, лук и лимонный сок.",
                25,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.french_tarte_flambee,
                "French Tarte Flambee",
                "Французский тарт фламбе родом из Эльзаса. " +
                        "У него тонкая корочка на дрожжевой основе, покрытая сметаной, салом и карамелизированным луком. " +
                        "Иногда в качестве основы для соуса используют фромаж блан.",
                31,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.moroccan_pizza,
                "Moroccan Pizza",
                "Марокканская пицца готовится с соусом маринара, " +
                        "моцареллой, курицей, морковью, зеленым луком, зелеными оливками, специями, такими как корица и тмин," +
                        "и оливковым маслом.",
                33,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.lahmajoun_pizza, "Lahmajoun pizza", "Лахмаджун — это турецкая пицца, " +
                        "Это очень тонкая лепешка с говяжьим или бараньим фаршем, томатным соусом, овощами, луком, петрушкой, " +
                        "иногда гранатом", 30, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.eggplant_pizza, "Eggplant pizza", "Иранская пицца с баклажанами. " +
                        "Эта пицца, приготовленная из йогурта, козьего сыра, вяленых помидоров, большого количества специй" +
                        " и баклажанов.", 27, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.beef_tongue_pizza,
                "Beef Tongue pizza",
                "Иранская пицца с говяжьим языком. " +
                        "Она сделана из нескольких ингредиентов. Она содержит грибы, лук, сыр и говяжий язык",
                46,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.calabrian_pizza,
                "Calabrian pizza",
                "Калабрийская пицца — представляет собой" +
                        "тонкую и более хрустящую, пиццу, приготовленную из помидоров и сыра моцарелла.",
                30,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.crocodile_pizza,
                "Crocodile pizza",
                "Австралийская Пицца из крокодилла, она сделана" +
                        " из томатного соуса, моцареллы, лайма, петрушки и филе крокодила.",
                60,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.bone_marrow_pizza,
                "Bone Marrow pizza",
                "Эта Английская пицца содержит томатный соус, " +
                        "костный мозг, грибы, свеклу, чеснок и рукколу",
                30,
                4,null,"Средняя 30см, традиционное тесто, 620 гр"
            ),
            Food(
                R.drawable.vegetables_mashrooms, "Vegetables and mushrooms pizza",
                "Итальянские травы, томатный соус, кубики брынзы, шампиньоны, сладкий перец, красный " +
                        "лук, маслины, томаты, моцарелла", 30, 4,null,"Средняя 30см, традиционное тесто, 620 гр"
            )
        )
    }

    fun beveragesList(): List<Food> {
        return listOf(
            Food(
                R.drawable.bonaqua_half_litter,
                "Bonaqva",
                "Вода Bonaqva негазированная 0,5л",
                5,
                3
            ),
            Food(R.drawable.coca_cola_half_litter, "Coca-Cola", "0,5л", 8, 3),
            Food(R.drawable.coca_cola_one_litter, "Coca-Cola", "1,25л", 14, 3),
            Food(R.drawable.coca_cola_zero, "Coca-Cola Zero", "0,5л", 8, 3),
            Food(R.drawable.dobriy_one_litter, "Добрый", "Сок 1л", 25, 3),
            Food(R.drawable.fanta_one_litter, "Fanta", "1,25л", 14, 3),
            Food(R.drawable.fanta_half_litter, "Fanta", "0,5л", 8, 3),
            Food(R.drawable.fuse_tea_half_litter, "Fusetea", "Черный чай с лимоном 0,5л", 8, 3),
            Food(R.drawable.sprite_half_litter, "Sprite", "0,5л", 8, 3),
            Food(R.drawable.sprite_one_litter, "Sprite", "1,25л", 14, 3)
        )
    }

    fun desertsList(): List<Food> {
        return listOf(
            Food(
                R.drawable.cheese_cake, "Чизкейк Нью-Йорк",
                "Классический американский творожный десерт", 20, 5
            ),
            Food(
                R.drawable.cookies, "2 Кукис Три шоколада",
                "С одной стороны, кукис — это хорошо, а с другой — два еще лучше. " +
                        "Сочетают в себе темный, бельгийский молочный и белый шоколад", 24, 5
            ),
            Food(
                R.drawable.maffins, "2 Маффина Три шоколада",
                "Основное блюдо заканчивается, начинаются маффины с начинкой на шоколадной основе " +
                        "с кубиками белого и молочного шоколада", 24, 5
            ),
            Food(
                R.drawable.ruletki, "Рулетики с брусникой",
                "Сладкие рулетики с натуральной брусникой политые сгущенным молоком, 16 шт", 24, 5
            ),
            Food(
                R.drawable.ruletki_korica, "Рулетики с корицей",
                "Горячие сладкие рулетики с пряной корицей и сахаром, 16 шт", 22, 5
            ),
            Food(
                R.drawable.sirniki, "Сырники с малиновым вареньем",
                "Нежные сырники, приготовленные в печи, с малиновым вареньем 4 шт", 25, 5
            ),
        )
    }

    fun snackList(): List<Food> {
        return listOf(
            Food(
                R.drawable.ruletki_cheese, "Рулетики с сыром",
                "Сытные рулетики с моцареллой и сырным соусом, 16 шт", 27, 2
            ),
            Food(
                R.drawable.ruletki_pepperoni, "Рулетики с пепперони",
                "Горячие рулетики с колбасками пепперони, моцареллой и сырным соусом", 27, 2
            ),
            Food(
                R.drawable.ruletki_cheeze_pepperoni,
                "Рулетики с пепперони + Рулетики с сыром",
                "Микс горячих рулетиков с сырным соусом: 8 штук с пепперони и моцареллой, 8 штук с моцареллой",
                27,
                2
            ),
            Food(
                R.drawable.potato, "Картофель из печи большая порция",
                "Ароматный запеченный картофель с итальянскими травами. Большая порция", 24, 2
            ),
            Food(
                R.drawable.dodster,
                "Додстер",
                "Легендарная горячая закуска с цыплёнком, томатами, моцареллой, соусом ранч в тонкой пшеничной лепешке",
                23,
                2
            ),
            Food(
                R.drawable.ostriy_dodster,
                "Острый Додстер",
                "Горячая закуска с цыпленком, перцем халапеньо, солеными огурчиками, томатами, моцареллой и соусом барбекю в тонкой пшеничной лепешке",
                23,
                2
            ),
            Food(
                R.drawable.starter_myasnoy,
                "Мясной Стартер",
                "Горячая закуска с митболами из говядины, томатами, моцареллой и пикантным соусом бургер в тонкой пшеничной лепешке",
                23,
                2
            ),
            Food(
                R.drawable.starter_gribnoy,
                "Стартер Грибной",
                "Горячая закуска с шампиньонами, моцареллой и соусом ранч в тонкой пшеничной лепешке",
                23,
                2
            ),
            Food(
                R.drawable.starter_cheese,
                "Сырный стартер",
                "Горячая закуска с очень сырной начинкой. Моцарелла, пармезан, чеддер и соус ранч в тонкой пшеничной лепешке",
                23,
                2
            ),
            Food(
                R.drawable.kurinnie_krilya, "Куриные крылья",
                "Куриные крылышки со специями и ароматом копчения. Большая порция", 23, 2
            ),
            Food(
                R.drawable.lunchbox,
                "Ланчбокс с крыльями барбекю",
                "Горячий сытный обед из куриных крыльев со специями и ароматом копчения, картофеля из печи с итальянскими травами и соуса барбекю",
                40,
                2
            ),
            Food(
                R.drawable.kusochki, "Куриные кусочки",
                "Сочное куриное филе в хрустящей панировке", 46, 2
            ),
            Food(
                R.drawable.greece,
                "Салат Греческий с соусом бальзамик",
                "Салат айсберг, томаты черри, маслины, свежий огурец, кубики брынзы, соус бальзамик",
                27,
                2
            ),
            Food(
                R.drawable.cezar, "Салат Цезарь",
                "салат", 27, 2
            )
        )
    }


    fun comboList(): List<Food> {
        return listOf(
            Food(
                R.drawable.ten_pizza, "10 средних пицц",
                "10 пицц 30см на любой вкус.Для компании из 20 - 30 человек", 647, 1,
                pizzaList().filterIndexed { index, _ -> (index < 10) }
            ),
            Food(
                R.drawable.three_pizza,
                "3 пиццы",
                "Комбо 3 пиццы 30 см на любой вкус",
                216,
                1,
                pizzaList().filterIndexed { index, _ -> (index < 3) }
            ),
            Food(
                R.drawable.two_pizza,
                "2 пиццы",
                "Самое популярное комбо из 2 пицц 30 см. Большой выбор",
                150,
                1,
                pizzaList().filterIndexed { index, _ -> (index < 2) }
            ),
            Food(
                R.drawable.seven_pizza,
                "7 пицц",
                "7 пицц 30 см. Большой выбор",
                455,
                1,
                pizzaList().filterIndexed { index, _ -> (index < 7) }),
            Food(
                R.drawable.two_pizza_soda,
                "2 пиццы и напиток",
                "2 пиццы 25 см и напиток на выбор. Для компании из 2–4 человек",
                94,
                1,pizzaList().filterIndexed { index, _ -> (index < 2) }+beveragesList().filterIndexed { index, _ -> (index < 1) }
            ),
            Food(
                R.drawable.pizza_zakuski, "Пицца и 2 закуски",
                "Пицца 30 см и 2 закуски на выбор. Для компании из 2–4 человек", 106, 1,
                pizzaList().filterIndexed { index, _ -> (index < 1) }+snackList().filterIndexed { index, _ -> (index < 2) }
            ),
            Food(
                R.drawable.four_dodster, "4 Додстера",
                "4 любых Додстера на выбор: Острый или Классический", 82, 1, listOf(snackList()[4],snackList()[4],snackList()[4],snackList()[4])
            ),
            Food(
                R.drawable.two_starter, "2 стартера",
                "2 стартера", 41, 1, listOf(snackList()[6],snackList()[6])
            ),
            Food(
                R.drawable.mix, "Пицца, додстер, напиток и соус",
                "Пицца 25 см, додстер, напиток и соус. Для компании из 1–2 человек", 79, 1,pizzaList().filterIndexed{ index, _ -> (index < 1) }+snackList()[4]+beveragesList()[0]+snackList()[6]
            ),
        )
    }
}