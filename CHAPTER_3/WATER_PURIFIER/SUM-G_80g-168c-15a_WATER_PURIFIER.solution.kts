
solution {
    puzzle = "P025"
    name = "B AX"
    arm(PISTON) {
        number = 1
        position = 0 to 1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 2
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
