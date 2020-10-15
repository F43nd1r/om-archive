
solution {
    puzzle = "P084"
    name = "B X CGX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 7 to 5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 9 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 10 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 4 to 6
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 5 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 8 to 2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 7 to 0
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 6 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 7 to 4
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 5 to 3
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 6 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 4
        rotation = 0
    }
    track {
        position = 8 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 5 to 6
        positions = listOf(-1 to 0, -1 to -1, 0 to -2, 0 to -1)
    }
    track {
        position = 9 to 4
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 8 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                forward()
                forward()
                drop()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                forward()
                grab()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
