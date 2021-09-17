package com.mlhysrszn.periodictable.util

import com.mlhysrszn.periodictable.R
import com.mlhysrszn.periodictable.model.Element
import com.mlhysrszn.periodictable.model.Number

object Utils {

    fun getDummyData(): ArrayList<Any> {
        return list
    }

    private val number1 = Number(1)
    private val number2 = Number(2)
    private val number3 = Number(3)
    private val number4 = Number(4)
    private val number5 = Number(5)
    private val number6 = Number(6)
    private val number7 = Number(7)
    private val number8 = Number(8)
    private val number9 = Number(9)
    private val number10 = Number(10)
    private val number11 = Number(11)
    private val number12 = Number(12)
    private val number13 = Number(13)
    private val number14 = Number(14)
    private val number15 = Number(15)
    private val number16 = Number(16)
    private val number17 = Number(17)
    private val number18 = Number(18)

    // Column 1
    private val element1 = Element(
        1, "H", "Hydrogen", 1.008f, R.color.bg_nonmetal, NONMETAL
    )
    private val element2 = Element(
        3, "Li", "Lithium", 6.94f, R.color.bg_alkali_metal, ALKALI_METAL,
    )
    private val element3 = Element(
        11, "Na", "Sodium", 22.989769282f, R.color.bg_alkali_metal, ALKALI_METAL
    )
    private val element4 = Element(
        19, "K", "Potassium", 39.09831f, R.color.bg_alkali_metal, ALKALI_METAL
    )
    private val element5 = Element(
        37, "Rb", "Rubidium", 85.46783f, R.color.bg_alkali_metal, ALKALI_METAL
    )
    private val element6 = Element(
        55, "Cs", "Cesium", 132.905451966f, R.color.bg_alkali_metal, ALKALI_METAL
    )
    private val element7 = Element(
        87, "Fr", "Francium", 208.980401f, R.color.bg_alkali_metal, ALKALI_METAL
    )

    // Column 1

    private val element8 = Element(
        4, "Be", "Beryllium", 9.012183f, R.color.bg_alkaline_earth_metal, ALKALINE_EARTH_METAL
    )
    private val element9 = Element(
        12, "Mg", "Magnesium", 24.305f, R.color.bg_alkaline_earth_metal, ALKALINE_EARTH_METAL
    )
    private val element10 = Element(
        20, "Ca", "Calcium", 40.08f, R.color.bg_alkaline_earth_metal, ALKALINE_EARTH_METAL
    )
    private val element11 = Element(
        38, "Sr", "Strontium", 87.62f, R.color.bg_alkaline_earth_metal, ALKALINE_EARTH_METAL
    )
    private val element12 = Element(
        56, "Ba", "Barium", 137.33f, R.color.bg_alkaline_earth_metal, ALKALINE_EARTH_METAL
    )
    private val element13 = Element(
        88, "Ra", "Radium", 225.02541f, R.color.bg_alkaline_earth_metal, ALKALINE_EARTH_METAL
    )

    // Column 3
    private val element14 = Element(
        21, "Sc", "Scandium", 44.95591f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element15 = Element(
        39, "Y", "Yttrium", 88.90584f, R.color.bg_transition_metal, TRANSITION_METAL
    )

    // Column 4
    private val element16 = Element(
        22, "Ti", "Titanium", 47.867f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element17 = Element(
        40, "Zr", "Zirconium", 91.22f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element18 = Element(
        72, "Hf", "Hafnium", 178.49f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element19 = Element(
        104, "Rf", "Rutherfordium", 267.122f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element20 = Element(
        57, "La", "Lanthanum", 138.9055f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element21 = Element(
        89, "Ac", "Actinium", 227.02775f, R.color.bg_actinide, ACTINIDE
    )

    // Column 5
    private val element22 = Element(
        23, "V", "Vanadium", 50.9415F, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element23 = Element(
        41, "Nb", "Niobium", 92.90637f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element24 = Element(
        73, "Ta", "Tantalum", 180.9479f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element25 = Element(
        105, "Db", "Dubnium", 268.126f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element26 = Element(
        58, "Ce", "Cerium", 140.116f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element27 = Element(
        90, "Th", "Thorium", 232.038f, R.color.bg_actinide, ACTINIDE
    )

    // Column 6
    private val element28 = Element(
        24, "Cr", "Chromium", 51.996f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element29 = Element(
        42, "Mo", "Molybdenum", 95.95f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element30 = Element(
        74, "W", "Tungsten", 183.84f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element31 = Element(
        106, "Sg", "Seaborgium", 269.128f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element32 = Element(
        59, "Pr", "Praseodymium", 140.90766f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element33 = Element(
        91, "Pa", "Protactinium", 231.03588f, R.color.bg_actinide, ACTINIDE
    )

    // Column 7
    private val element34 = Element(
        25, "Mn", "Manganese", 54.93804f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element35 = Element(
        43, "Tc", "Technetium", 96.90636f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element36 = Element(
        75, "Re", "Rhenium", 186.207f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element37 = Element(
        107, "Bh", "Bohrium", 270.133f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element38 = Element(
        60, "Nd", "Neodymium", 144.24f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element39 = Element(
        92, "U", "Uranium", 238.0289f, R.color.bg_actinide, ACTINIDE
    )

    // Column 8
    private val element40 = Element(
        26, "Fe", "Iron", 55.84f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element41 = Element(
        44, "Ru", "Ruthenium", 101.1f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element42 = Element(
        76, "Os", "Osmium", 190.2f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element43 = Element(
        108, "Hs", "Hassium", 269.1336f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element44 = Element(
        61, "Pm", "Promethium", 144.91276f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element45 = Element(
        93, "Np", "Neptunium", 237.048172f, R.color.bg_actinide, ACTINIDE
    )

    // Column 9
    private val element46 = Element(
        27, "Co", "Cobalt", 58.93319f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element47 = Element(
        45, "Rh", "Rhodium", 102.9055f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element48 = Element(
        77, "Ir", "Iridium", 192.22f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element49 = Element(
        109, "Mt", "Meitnerium", 277.154f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element50 = Element(
        62, "Sm", "Samarium", 150.4f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element51 = Element(
        94, "Pu", "Plutonium", 244.06420f, R.color.bg_actinide, ACTINIDE
    )

    // Column 10
    private val element52 = Element(
        28, "Ni", "Nickel", 58.693f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element53 = Element(
        46, "Pd", "Palladium", 106.42f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element54 = Element(
        78, "Pt", "Platinum", 195.08f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element55 = Element(
        110, "Ds", "Darmstadtium", 282.166f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element56 = Element(
        63, "Eu", "Europium", 151.964f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element57 = Element(
        95, "Am", "Americium", 243.061380f, R.color.bg_actinide, ACTINIDE
    )

    // Column 11
    private val element58 = Element(
        29, "Cu", "Copper,", 63.55f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element59 = Element(
        47, "Ag", "Silver", 107.868f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element60 = Element(
        79, "Au", "Gold", 196.96657f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element61 = Element(
        111, "Rg", "Roentgenium", 282.169f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element62 = Element(
        64, "Gd", "Gadolinium", 157.2f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element63 = Element(
        96, "Cm", "Curium", 247.07035f, R.color.bg_actinide, ACTINIDE
    )

    // Column 12
    private val element64 = Element(
        30, "Zn", "Zinc", 65.4f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element65 = Element(
        48, "Cd", "Cadmium", 112.41f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element66 = Element(
        80, "Hg", "Mercury", 200.59f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element67 = Element(
        112, "Cn", "Copernicium", 286.179f, R.color.bg_transition_metal, TRANSITION_METAL
    )
    private val element68 = Element(
        65, "Tb", "Terbium", 158.92535f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element69 = Element(
        97, "Bk", "Berkelium", 247.07031f, R.color.bg_actinide, ACTINIDE
    )

    // Column 13
    private val element70 = Element(
        5, "B", "Boron", 10.81f, R.color.bg_metalloid, METALLOID
    )
    private val element71 = Element(
        13, "Al", "Aluminum", 26.981538f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element72 = Element(
        31, "Ga", "Gallium", 69.723f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element73 = Element(
        49, "In", "Indium", 114.818f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element74 = Element(
        81, "Tl", "Thallium", 204.383f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element75 = Element(
        113, "Nh", "Nihonium", 286.182f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element76 = Element(
        66, "Dy", "Dysprosium", 162.500f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element77 = Element(
        98, "Cf", "Californium", 251.07959f, R.color.bg_actinide, ACTINIDE
    )

    // Column 14
    private val element78 = Element(
        6, "C", "Carbon", 12.011f, R.color.bg_nonmetal, NONMETAL
    )
    private val element79 = Element(
        14, "Si", "Silicon", 28.085f, R.color.bg_metalloid, METALLOID
    )
    private val element80 = Element(
        32, "Ge", "Germanium", 72.63f, R.color.bg_metalloid, METALLOID
    )
    private val element81 = Element(
        50, "Sn", "Tin", 118.71f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element82 = Element(
        82, "Pb", "Lead", 207f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element83 = Element(
        114, "Fl", "Flerovium", 290.192f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element84 = Element(
        67, "Ho", "Holmium", 164.93033f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element85 = Element(
        99, "Es", "Einsteinium", 252.0830f, R.color.bg_actinide, ACTINIDE
    )

    // Column 15
    private val element86 = Element(
        7, "N", "Nitrogen", 14.007f, R.color.bg_nonmetal, NONMETAL
    )
    private val element87 = Element(
        15, "P", "Phosphorus", 30.973762f, R.color.bg_nonmetal, NONMETAL
    )
    private val element88 = Element(
        33, "As", "Arsenic", 74.92159f, R.color.bg_metalloid, METALLOID
    )
    private val element89 = Element(
        51, "Sb", "Antimony", 121.760f, R.color.bg_metalloid, METALLOID
    )
    private val element90 = Element(
        83, "Bi", "Bismuth", 208.98040f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element91 = Element(
        115, "Mc", "Moscovium", 290.196f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element92 = Element(
        68, "Er", "Erbium", 167.26f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element93 = Element(
        100, "Fm", "Fermium", 257.09511f, R.color.bg_actinide, ACTINIDE
    )

    // Column 16
    private val element94 = Element(
        8, "O", "Oxygen", 15.999f, R.color.bg_nonmetal, NONMETAL
    )
    private val element95 = Element(
        16, "S", "Sulfur", 32.07f, R.color.bg_nonmetal, NONMETAL
    )
    private val element96 = Element(
        34, "Se", "Selenium", 78.97f, R.color.bg_nonmetal, NONMETAL
    )
    private val element97 = Element(
        52, "Te", "Tellurium", 127.6f, R.color.bg_metalloid, METALLOID
    )
    private val element98 = Element(
        84, "Po", "Polonium", 208.98243f, R.color.bg_metalloid, METALLOID
    )
    private val element99 = Element(
        116, "Lv", "Livermorium", 293.205f, R.color.bg_post_transition_metal, POST_TRANSITION_METAL
    )
    private val element100 = Element(
        69, "Tm", "Thulium", 168.93422f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element101 = Element(
        101, "Md", "Mendelevium", 258.09843f, R.color.bg_actinide, ACTINIDE
    )

    // Column 17
    private val element102 = Element(
        9, "F", "Fluorine", 18.99840316f, R.color.bg_halogen, HALOGEN
    )
    private val element103 = Element(
        17, "Cl", "Chlorine", 35.45f, R.color.bg_halogen, HALOGEN
    )
    private val element104 = Element(
        35, "Br", "Bromine", 79.90f, R.color.bg_halogen, HALOGEN
    )
    private val element105 = Element(
        53, "I", "Iodine", 126.9045f, R.color.bg_halogen, HALOGEN
    )
    private val element106 = Element(
        85, "At", "Astatine", 209.98715f, R.color.bg_halogen, HALOGEN
    )
    private val element107 = Element(
        117, "Ts", "Tennessine", 294.211f, R.color.bg_halogen, HALOGEN
    )
    private val element108 = Element(
        70, "Yb", "Ytterbium", 173.05f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element109 = Element(
        102, "No", "Nobelium", 259.10100f, R.color.bg_actinide, ACTINIDE
    )

    // Column 18
    private val element110 = Element(
        2, "He", "Helium", 4.00260f, R.color.bg_noble_gas, NOBLE_GAS
    )
    private val element111 = Element(
        10, "Ne", "Neon", 20.180f, R.color.bg_noble_gas, NOBLE_GAS
    )
    private val element112 = Element(
        18, "Ar", "Argon", 39.9f, R.color.bg_noble_gas, NOBLE_GAS
    )
    private val element113 = Element(
        36, "Kr", "Krypton", 83.80f, R.color.bg_noble_gas, NOBLE_GAS
    )
    private val element114 = Element(
        54, "Xe", "Xenon", 131.29f, R.color.bg_noble_gas, NOBLE_GAS
    )
    private val element115 = Element(
        86, "Rn", "Radon", 222.01758f, R.color.bg_noble_gas, NOBLE_GAS
    )
    private val element116 = Element(
        118, "Og", "Oganesson", 295.216f, R.color.bg_noble_gas, NOBLE_GAS
    )
    private val element117 = Element(
        71, "Lu", "Lutetium", 174.9668f, R.color.bg_lanthanide, LANTHANIDE
    )
    private val element118 = Element(
        103, "Lr", "Lawrencium", 266.120f, R.color.bg_actinide, ACTINIDE
    )

    private val elementStar =
        Element(symbol = "*", backgroundColor = R.color.bg_color, textColor = "#F2F2F2")
    private val elementStar2 =
        Element(symbol = "**", backgroundColor = R.color.bg_color, textColor = "#F2F2F2")
    private val elementEmpty = Element(textColor = "#FFFFFF")

    private val list = arrayListOf(
        number1,
        element1,
        element2,
        element3,
        element4,
        element5,
        element6,
        element7,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        number2,
        elementEmpty,
        element8,
        element9,
        element10,
        element11,
        element12,
        element13,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        number3,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element14,
        element15,
        elementStar,
        elementStar2,
        elementEmpty,
        elementStar,
        elementStar2,
        number4,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element16,
        element17,
        element18,
        element19,
        elementEmpty,
        element20,
        element21,
        number5,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element22,
        element23,
        element24,
        element25,
        elementEmpty,
        element26,
        element27,
        number6,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element28,
        element29,
        element30,
        element31,
        elementEmpty,
        element32,
        element33,
        number7,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element34,
        element35,
        element36,
        element37,
        elementEmpty,
        element38,
        element39,
        number8,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element40,
        element41,
        element42,
        element43,
        elementEmpty,
        element44,
        element45,
        number9,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element46,
        element47,
        element48,
        element49,
        elementEmpty,
        element50,
        element51,
        number10,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element52,
        element53,
        element54,
        element55,
        elementEmpty,
        element56,
        element57,
        number11,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element58,
        element59,
        element60,
        element61,
        elementEmpty,
        element62,
        element63,
        number12,
        elementEmpty,
        elementEmpty,
        elementEmpty,
        element64,
        element65,
        element66,
        element67,
        elementEmpty,
        element68,
        element69,
        number13,
        elementEmpty,
        element70,
        element71,
        element72,
        element73,
        element74,
        element75,
        elementEmpty,
        element76,
        element77,
        number14,
        elementEmpty,
        element78,
        element79,
        element80,
        element81,
        element82,
        element83,
        elementEmpty,
        element84,
        element85,
        number15,
        elementEmpty,
        element86,
        element87,
        element88,
        element89,
        element90,
        element91,
        elementEmpty,
        element92,
        element93,
        number16,
        elementEmpty,
        element94,
        element95,
        element96,
        element97,
        element98,
        element99,
        elementEmpty,
        element100,
        element101,
        number17,
        elementEmpty,
        element102,
        element103,
        element104,
        element105,
        element106,
        element107,
        elementEmpty,
        element108,
        element109,
        number18,
        element110,
        element111,
        element112,
        element113,
        element114,
        element115,
        element116,
        elementEmpty,
        element117,
        element118,
    )
}