
solution {
    puzzle = "P097"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -5 to 3
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to -6
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to -5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to -6
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to -5
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -4
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -3 to 1, -3 to 0, -4 to 0, -5 to 1)
    }
    track {
        position = -2 to -4
        positions = listOf(0 to 0, 1 to -1, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(13)
                grab()
                rotateCounterClockwise()
                back()
                forward()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(9)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
