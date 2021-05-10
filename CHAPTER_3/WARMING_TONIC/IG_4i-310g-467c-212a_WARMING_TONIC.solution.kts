
solution {
    puzzle = "P028"
    name = "INSTRUCTIONS 10"
    arm(ARM6) {
        number = 1
        position = -14 to -4
        rotation = -2
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -10 to -4
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -8 to -5
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -9 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -8
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -7 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to -3
        rotation = 0
    }
    track {
        position = -14 to -4
        positions = listOf(0 to 0, 0 to 1, -1 to 2, 0 to 2, 0 to 3, 1 to 2, 1 to 3, 0 to 4, 1 to 4, 2 to 3, 2 to 4, 3 to 4, 4 to 4, 4 to 3, 5 to 3, 6 to 2, 7 to 2, 6 to 3, 7 to 3, 8 to 2, 8 to 1, 9 to 0, 10 to -1, 10 to -2, 9 to -1, 9 to -2, 8 to -2, 9 to -3, 9 to -4, 9 to -5, 9 to -6, 8 to -6, 7 to -6, 6 to -6, 5 to -6, 4 to -5, 4 to -4, 3 to -3, 2 to -2, 1 to -1)
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
