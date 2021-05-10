
solution {
    puzzle = "P019"
    name = "INSTRUCTIONS 7"
    arm(ARM6) {
        number = 1
        position = -7 to -6
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -11 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -13 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -13 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -14 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -14 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -10 to -3
        rotation = 0
    }
    track {
        position = -5 to -1
        positions = listOf(-2 to -5, -3 to -5, -3 to -6, -4 to -5, -4 to -6, -5 to -6, -5 to -7, -6 to -6, -7 to -6, -7 to -5, -8 to -5, -9 to -4, -9 to -5, -10 to -4, -10 to -3, -11 to -2, -11 to -1, -10 to -2, -9 to -3, -8 to -4, -7 to -4, -6 to -5, -5 to -5, -6 to -4, -6 to -3, -5 to -4, -5 to -3, -4 to -4, -3 to -4, -4 to -3, -3 to -3, -2 to -4)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
