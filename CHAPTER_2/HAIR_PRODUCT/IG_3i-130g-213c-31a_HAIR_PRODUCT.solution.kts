
solution {
    puzzle = "P016"
    name = "INSTRUCTIONS 11"
    arm(ARM6) {
        number = 1
        position = 0 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 2 to 1
        positions = listOf(-2 to 1, -3 to 2, -4 to 2, -4 to 1, -5 to 2, -5 to 3, -4 to 3, -3 to 3, -2 to 3, -2 to 2, -1 to 1, -1 to 0)
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
