
solution {
    puzzle = "P083"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 10 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 8 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 8 to -2
        rotation = 1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 9 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 1, 0 to 2)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 7 to 0
        positions = listOf(0 to 0, 1 to -1, 0 to -1, 1 to -2)
    }
    conduit {
        id = 100
        position = 1 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = 10 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                grab()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(16)
                grab()
                back()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                forward()
                wait(1)
                rotateClockwise()
                reset()
                wait(1)
                back()
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                wait(3)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
