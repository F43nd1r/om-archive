
solution {
    puzzle = "P028"
    name = "W3.5"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -1 to 1
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -2 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -6 to -2
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -4 to -3
        rotation = -5
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 7
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 9
    }
    glyph(CALCIFICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -3
        rotation = 8
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    track {
        position = -4 to -4
        positions = listOf(-1 to -1, -1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = 0 to 1
        positions = listOf(1 to -1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(9)
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                drop()
                back()
                reset()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
