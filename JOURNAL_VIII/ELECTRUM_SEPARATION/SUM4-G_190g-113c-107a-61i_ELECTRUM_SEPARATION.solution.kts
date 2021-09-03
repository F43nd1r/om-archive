
solution {
    puzzle = "P103"
    name = "B F NOGIF"
    arm(ARM1) {
        number = 1
        position = -4 to 6
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 5 to 0
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to -2
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -7 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 7 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 7 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 0 to -1
        rotation = -3
    }
    track {
        position = -4 to 7
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 4 to 0
        positions = listOf(2 to 0, 1 to 0, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                pivotClockwise()
                back()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                back()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(109)
                forward()
                grab()
                back()
                back()
            }
        }
        )
    }
}
