
solution {
    puzzle = "P028"
    name = "B CA 2T"
    arm(PISTON) {
        number = 1
        position = 0 to 1
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 3 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 3 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 4 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 4 to -4
        rotation = 1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to -2
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -2
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = 4 to -5
        positions = listOf(-1 to 1, -2 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                back()
                extend()
                drop()
                retract()
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                back()
                wait(1)
                grab()
                back()
                back()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
