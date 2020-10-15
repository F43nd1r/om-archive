
solution {
    puzzle = "P027"
    name = "B CAX 6T"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 0 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -2
        rotation = 7
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 3 to -2
        positions = listOf(-1 to 0, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                retract()
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
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                forward()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
