
solution {
    puzzle = "P039"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 2 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to -2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -1 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -3 to -6
        rotation = -1
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -3
        rotation = 7
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -9
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -8 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(-1 to 0, -1 to -1, 0 to -2, 0 to -1)
    }
    track {
        position = -1 to 1
        positions = listOf(-1 to 0, 0 to 0, 0 to -1, -1 to -1)
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
                forward()
                drop()
                wait(2)
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
                drop()
                wait(1)
                grab()
                forward()
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
                repeat()
                wait(5)
                forward()
                wait(1)
                forward()
                forward()
                reset()
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
                back()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
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
            sequence(7) {
                wait(47)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
