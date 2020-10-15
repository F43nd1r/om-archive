
solution {
    puzzle = "P062"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to 3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -6 to 1
        rotation = 12
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -6 to 2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -3 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -5 to 2
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -15 to -9
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 2)
    }
    track {
        position = -3 to -3
        positions = listOf(-1 to -3, 0 to -3, 0 to -2, 0 to -1, 0 to 0, 0 to 1, 0 to 2, -1 to 3, -2 to 3, -3 to 4, -2 to 4, -3 to 5, -2 to 5, -1 to 4, -1 to 5, -2 to 6)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                forward()
                forward()
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                forward()
                forward()
                grab()
                back()
                drop()
                back()
                wait(5)
                forward()
                wait(1)
                back()
                grab()
                back()
                drop()
                forward()
                wait(3)
                forward()
                wait(1)
                back()
                grab()
                back()
                drop()
                forward()
                wait(3)
                forward()
                wait(1)
                back()
                grab()
                back()
                drop()
                forward()
                wait(3)
                forward()
                wait(1)
                back()
                grab()
                back()
                drop()
                forward()
                wait(3)
                forward()
                wait(1)
                back()
                grab()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                back()
                reset()
                wait(2)
                forward()
                wait(1)
                back()
                wait(2)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                forward()
                forward()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                back()
                drop()
                back()
                wait(3)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
