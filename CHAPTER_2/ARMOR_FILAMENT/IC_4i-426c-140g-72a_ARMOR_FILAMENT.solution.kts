
solution {
    puzzle = "P020"
    name = "IC"
    arm(ARM6) {
        number = 1
        position = -3 to 1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 3
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = 1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(0 to -1, 0 to -2, 1 to -2, 2 to -2, 3 to -2, 4 to -2, 5 to -2, 5 to -1, 4 to 0, 4 to -1, 3 to 0, 2 to 0, 2 to -1, 1 to -1, 1 to 0, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
                back()
            }
        }
        )
    }
}
