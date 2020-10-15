
solution {
    puzzle = "P093"
    name = "B CG"
    arm(PISTON) {
        number = 1
        position = -2 to 2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -1 to 2
        rotation = -8
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 0 to 2
        rotation = -8
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 1 to 1
        rotation = -8
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 9 to 2
        rotation = -9
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 8 to -1
        rotation = -5
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = 10 to 1
        rotation = -3
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 8 to 1
        rotation = -8
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = -9
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 11 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 9 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 1, 1 to 0, 0 to 0, -1 to 1)
    }
    track {
        position = 2 to -1
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, 0 to 1)
    }
    conduit {
        id = 100
        position = 8 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(4)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(2)
                back()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(12)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(5)
                grab()
                extend()
                pivotCounterClockwise()
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
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                forward()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                back()
                extend()
                drop()
                back()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                grab()
                back()
                wait(1)
                back()
                extend()
                drop()
                wait(1)
                forward()
                wait(1)
                grab()
                back()
                drop()
                back()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                grab()
                back()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                extend()
                reset()
                wait(5)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                back()
                wait(1)
                back()
                grab()
                back()
                wait(1)
                rotateCounterClockwise()
                drop()
                forward()
                wait(4)
                back()
                wait(5)
                reset()
            }
        }
        )
    }
}
