
solution {
    puzzle = "P012"
    name = "INSTRUCTIONS 8"
    arm(ARM6) {
        number = 1
        position = -12 to 5
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -11 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -12 to 0
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = -10 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -12 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -12 to -1
        rotation = 0
    }
    track {
        position = -15 to -1
        positions = listOf(3 to 6, 4 to 5, 3 to 5, 4 to 4, 3 to 4, 2 to 4, 1 to 4, 0 to 4, -1 to 4, -1 to 3, -1 to 2, -1 to 1, 0 to 0, 0 to 1, 1 to 0, 1 to 1, 2 to 0, 3 to -1, 4 to -2, 5 to -2, 6 to -3, 6 to -2, 7 to -3, 7 to -2, 7 to -1, 8 to -2, 8 to -1, 7 to 0, 7 to 1, 7 to 2, 8 to 1, 8 to 2, 7 to 3, 6 to 4, 5 to 5, 4 to 6)
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
