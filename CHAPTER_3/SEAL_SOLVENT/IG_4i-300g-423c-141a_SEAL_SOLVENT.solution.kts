
solution {
    puzzle = "P026"
    name = "INSTRUCTIONS 9"
    arm(ARM6) {
        number = 1
        position = -2 to 4
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -4 to -1
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 3
        rotation = 0
    }
    track {
        position = 0 to 3
        positions = listOf(-2 to 1, -2 to 0, -3 to 0, -3 to -1, -3 to -2, -4 to -1, -5 to -1, -5 to 0, -6 to 1, -7 to 1, -7 to 0, -6 to 0, -6 to -1, -6 to -2, -7 to -1, -7 to -2, -7 to -3, -6 to -4, -5 to -5, -4 to -5, -3 to -6, -2 to -6, -1 to -6, 0 to -7, 0 to -6, 1 to -6, 1 to -5, 2 to -5, 2 to -4, 3 to -4, 2 to -3, 2 to -2, 1 to -1, 1 to 0, 0 to 0, -1 to 1)
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
