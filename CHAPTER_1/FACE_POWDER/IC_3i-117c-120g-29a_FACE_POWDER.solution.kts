
solution {
    puzzle = "P009"
    name = "INSTRUCTIONS 11"
    arm(ARM6) {
        number = 1
        position = 1 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = -3
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 2, -1 to 2, -2 to 2, -3 to 2, -3 to 1, -2 to 0, -1 to 0)
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
