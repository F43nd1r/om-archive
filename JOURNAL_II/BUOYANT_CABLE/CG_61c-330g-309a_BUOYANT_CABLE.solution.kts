
solution {
    puzzle = "P062"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to 3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -4 to 2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -5 to 2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 1
        rotation = 12
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -2 to -5
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -11 to -12
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -16 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    track {
        position = 4 to -1
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 2)
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 2, -1 to 3, -2 to 3, -3 to 4, -2 to 4, -3 to 5, -2 to 5, -1 to 4, -1 to 5, -2 to 6)
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
                wait(10)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
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
            sequence(4) {
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
            sequence(8) {
                wait(3)
                forward()
                wait(2)
                grab()
                back()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(2)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                wait(3)
                forward()
                forward()
                wait(1)
                back()
                grab()
                back()
                drop()
                wait(1)
                forward()
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                wait(1)
                forward()
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                wait(1)
                forward()
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                wait(1)
                forward()
                forward()
                wait(3)
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
            sequence(5) {
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
            sequence(6) {
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
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
            sequence(9) {
                wait(11)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
