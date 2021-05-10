
solution {
    puzzle = "P027"
    name = "INSTRUCTIONS 10"
    arm(ARM6) {
        number = 1
        position = -4 to -7
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -6 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -4
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -6 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -6
        rotation = 0
    }
    track {
        position = -4 to -7
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -3 to 3, -4 to 3, -5 to 4, -5 to 5, -4 to 5, -4 to 6, -3 to 6, -4 to 7, -5 to 7, -5 to 6, -6 to 6, -6 to 5, -6 to 4, -5 to 3, -4 to 2, -3 to 2, -3 to 1, -2 to 1, -1 to 0)
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
