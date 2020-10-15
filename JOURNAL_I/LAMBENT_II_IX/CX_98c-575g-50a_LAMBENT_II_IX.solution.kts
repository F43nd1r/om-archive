
solution {
    puzzle = "P058"
    name = "B CA"
    arm(PISTON) {
        number = 1
        position = 3 to -7
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 5 to -7
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -7
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 3 to -6
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 6 to -7
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 6 to -5
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 6 to -4
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = 6 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 5 to -3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = 4 to -2
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = 1 to 0
        rotation = 5
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to -4
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 2 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -5
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 5 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -5
        rotation = 0
    }
    track {
        position = 3 to -7
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 4 to -6
        positions = listOf(0 to 0, -1 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 6 to -4
        positions = listOf(0 to 0, 0 to -1, -1 to 0)
    }
    track {
        position = 6 to -3
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                forward()
                extend()
                drop()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                extend()
                drop()
                forward()
                forward()
                retract()
                wait(1)
                reset()
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                extend()
                extend()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                retract()
                forward()
                reset()
                wait(4)
                grab()
                back()
                retract()
                extend()
                drop()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                back()
                back()
                wait(1)
                grab()
                retract()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                forward()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(2)
                forward()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
                extend()
                wait(1)
                grab()
                retract()
                retract()
                wait(2)
                extend()
                wait(2)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                wait(1)
                forward()
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                back()
                forward()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                forward()
                grab()
                back()
                drop()
                wait(4)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
