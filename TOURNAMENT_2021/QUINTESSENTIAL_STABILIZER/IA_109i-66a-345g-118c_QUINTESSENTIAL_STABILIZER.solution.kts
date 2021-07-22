
solution {
    puzzle = "w2450512626"
    name = "B X S FA"
    arm(ARM1) {
        number = 1
        position = -4 to 2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to 2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to 3
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 3 to 3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 5 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 4 to -2
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 6 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -3 to 3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 0
        rotation = 2
    }
    glyph(UNIFICATION) {
        position = 4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -3 to 4
        rotation = 3
    }
    io(INPUT) {
        index = 2
        position = 3 to 4
        rotation = -1
    }
    io(INPUT) {
        index = 3
        position = -1 to 5
        rotation = -1
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                pivotClockwise()
                back()
                back()
                back()
                drop()
                back()
                reset()
                grab()
                rotateClockwise()
                pivotClockwise()
                back()
                back()
                pivotClockwise()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                grab()
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
            }
        }
        )
    }
}
