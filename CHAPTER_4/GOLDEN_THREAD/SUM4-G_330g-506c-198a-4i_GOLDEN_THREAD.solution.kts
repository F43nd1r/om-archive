
solution {
    puzzle = "P037"
    name = "INSTRUCTIONS 19"
    arm(ARM6) {
        number = 1
        position = 6 to -4
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = 7 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 2 to 0
        rotation = -4
    }
    glyph(MULTI_BONDER) {
        position = 4 to -1
        rotation = -5
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to -1
        rotation = 0
    }
    track {
        position = 6 to -4
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 2 to 0, 3 to 0, 2 to 1, 3 to 1, 2 to 2, 2 to 3, 1 to 3, 1 to 4, 0 to 5, 0 to 6, 1 to 5, 2 to 5, 2 to 4, 3 to 3, 3 to 2, 4 to 1, 4 to 0, 4 to -1, 3 to -1, 2 to -1, 1 to -1, 0 to -1, -1 to 0, -1 to -1, -2 to 0, -3 to 0, -4 to 0, -5 to 1, -6 to 1, -5 to 0, -6 to 0, -7 to 1, -8 to 1, -8 to 2, -7 to 2, -6 to 2, -5 to 2, -4 to 1, -3 to 1, -2 to 1, -1 to 1)
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
