
solution {
    puzzle = "P008"
    name = "INSTRUCTIONS 11"
    arm(ARM6) {
        number = 1
        position = -4 to -5
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -11 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -9 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -11 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -8 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -7 to -2
        rotation = 0
    }
    track {
        position = -4 to -5
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 2, -3 to 1, -2 to 0, -1 to -1, -2 to -1, -3 to -1, -4 to 0, -4 to -1, -5 to 0, -5 to -1, -6 to 0, -6 to -1, -5 to -2, -4 to -3, -3 to -3, -3 to -2, -2 to -3, -1 to -3, -1 to -2, 0 to -2, 0 to -1)
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
