
solution {
    puzzle = "P083"
    name = "B CI"
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
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to -2
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -2 to 2
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 8 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 7 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 6 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 10 to -2
        rotation = 2
        size = 3
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
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
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
                grab()
                back()
                wait(2)
                drop()
                forward()
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                back()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                retract()
                retract()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                wait(11)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                forward()
                drop()
                wait(7)
                back()
                wait(1)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                forward()
                grab()
                back()
                drop()
                wait(2)
                forward()
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(19)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
