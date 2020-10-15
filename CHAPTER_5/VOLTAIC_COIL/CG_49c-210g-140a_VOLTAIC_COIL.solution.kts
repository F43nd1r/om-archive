
solution {
    puzzle = "P039"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 2 to 1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -5 to 2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -4 to 2
        rotation = 6
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = 7
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -10 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 3
        rotation = 0
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -1 to 1)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                forward()
                grab()
                back()
                back()
                wait(1)
                forward()
                wait(1)
                drop()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                forward()
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                back()
                grab()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                back()
                back()
                forward()
                drop()
                forward()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                back()
                back()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
