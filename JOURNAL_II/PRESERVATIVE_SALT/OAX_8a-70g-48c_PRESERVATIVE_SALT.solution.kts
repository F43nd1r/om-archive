
solution {
    puzzle = "P060"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 9
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 8
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
