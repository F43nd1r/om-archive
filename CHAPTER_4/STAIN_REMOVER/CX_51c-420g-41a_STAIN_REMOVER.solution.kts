
solution {
    puzzle = "P034"
    name = "B CA"
    arm(ARM1) {
        number = 1
        position = -8 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -7 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -6 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -7 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -4 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -1 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -5 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = -1 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -7 to 2
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = 7
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -7 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -1
        rotation = 0
    }
    track {
        position = -5 to -1
        positions = listOf(2 to -1, 1 to 0, 1 to -1)
    }
    track {
        position = -6 to 4
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -5 to 4
        positions = listOf(1 to 0, 2 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                extend()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                back()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        )
    }
}
