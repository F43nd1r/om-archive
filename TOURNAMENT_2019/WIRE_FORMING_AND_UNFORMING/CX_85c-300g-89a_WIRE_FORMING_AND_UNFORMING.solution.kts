
solution {
    puzzle = "w1698784331"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = 2 to -4
        rotation = -16
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = -14
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -5 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 0 to -5
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 6
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 6
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 0 to -3
        rotation = 11
    }
    glyph(PROJECTION) {
        position = -3 to 1
        rotation = 3
    }
    io(INFINITE) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -5
    }
    io(OUTPUT) {
        index = 1
        position = -4 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -2 to -3
        rotation = 60
    }
    io(INFINITE) {
        index = 2
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 2 to -4
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                forward()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                drop()
            }
        }
        )
    }
}
