
solution {
    puzzle = "P008"
    name = "INSTRUCTIONS 10"
    arm(ARM1) {
        number = 1
        position = 1 to -4
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    track {
        position = 1 to -5
        positions = listOf(0 to 1, 1 to 0, 2 to 0, 3 to 0, 3 to 1, 3 to 2, 4 to 1, 5 to 1, 4 to 2, 3 to 3, 2 to 3, 2 to 2, 1 to 2, 1 to 1, 0 to 2)
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
