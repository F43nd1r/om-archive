
solution {
    puzzle = "P102"
    name = "BILL 408! (92I)"
    arm(ARM1) {
        number = 1
        position = 4 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to 0
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to 4
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to 4
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to -1
        rotation = 7
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -7 to 6
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -4 to 4
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 4
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to 5
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 4 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 1 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -8 to 5
        rotation = 8
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 4 to 0
        rotation = -6
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 2
        rotation = 9
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(9)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(11)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(3)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
