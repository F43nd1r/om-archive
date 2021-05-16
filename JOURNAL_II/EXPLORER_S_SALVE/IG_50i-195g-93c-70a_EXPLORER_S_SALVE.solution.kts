
solution {
    puzzle = "P059"
    name = "B F"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -6 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to 2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 3 to -5
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to 0
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -3 to -2
        rotation = 6
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 2
        position = 5 to -5
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(0 to -1, -1 to 0)
    }
    track {
        position = -1 to -4
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(12)
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                pivotClockwise()
                reset()
                grab()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                back()
                pivotClockwise()
                back()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
