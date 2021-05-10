
solution {
    puzzle = "P020"
    name = "INSTRUCTIONS 10"
    arm(ARM6) {
        number = 1
        position = -12 to 0
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -8 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -9 to -1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -10 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -6 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -10 to -1
        rotation = 0
    }
    track {
        position = -12 to 0
        positions = listOf(0 to 0, 1 to -1, 0 to -1, 1 to -2, 2 to -2, 3 to -3, 3 to -4, 4 to -5, 4 to -4, 5 to -5, 6 to -5, 7 to -5, 7 to -6, 6 to -6, 5 to -6, 4 to -6, 3 to -5, 2 to -4, 1 to -3, 0 to -2, -1 to -1, -1 to 0)
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
