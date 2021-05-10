
solution {
    puzzle = "P013"
    name = "INSTRUCTIONS 7"
    arm(ARM6) {
        number = 1
        position = 1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 3
        rotation = -5
    }
    track {
        position = -2 to 0
        positions = listOf(3 to -1, 3 to -2, 2 to -2, 1 to -1, 0 to 0, 0 to 1, 1 to 1, 2 to 1, 2 to 2, 3 to 1, 3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
