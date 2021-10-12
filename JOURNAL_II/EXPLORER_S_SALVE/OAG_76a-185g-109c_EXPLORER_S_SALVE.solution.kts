
solution {
    puzzle = "P059"
    name = "408 SUM4"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -6 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to -1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -1 to 3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -5 to 4
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -6 to 2
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -1 to 4
        rotation = 2
    }
    io(INPUT) {
        index = 2
        position = -2 to 4
        rotation = 0
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
