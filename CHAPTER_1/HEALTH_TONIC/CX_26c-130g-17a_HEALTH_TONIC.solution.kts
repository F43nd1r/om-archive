
solution {
    puzzle = "P014"
    name = "B CA 2T"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 1 to 3
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 0
        rotation = 0
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
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                retract()
                retract()
                reset()
            }
        }
        )
    }
}
