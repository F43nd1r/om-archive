
solution {
    puzzle = "P066"
    name = "B CI302 3T"
    arm(ARM1) {
        number = 1
        position = 2 to -7
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -5
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -7
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 3 to -6
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 3 to -5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 4 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 6 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 5 to -4
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 9
        position = 6 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 6 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 1 to 2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -1 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 0 to 3
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 14
        position = -3 to 4
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 15
        position = -4 to 4
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -5
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -5
        rotation = 0
    }
    track {
        position = 2 to -6
        positions = listOf(2 to 2, 2 to 1, 2 to 0, 1 to 0, 0 to 1, 0 to 0, 0 to -1, 1 to -2)
    }
    track {
        position = 0 to 3
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = 5 to -4
        positions = listOf(0 to 1, 0 to 0, 1 to 0)
    }
    track {
        position = 6 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to 0)
    }
    track {
        position = -2 to -5
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    track {
        position = -3 to 3
        positions = listOf(1 to 0, 0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 1 to -7
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                reset()
                wait(5)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(8)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(8)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                pivotClockwise()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                wait(18)
                grab()
                back()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                forward()
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(3)
                forward()
                grab()
                back()
                reset()
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                pivotClockwise()
                drop()
                wait(3)
                reset()
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                forward()
                grab()
                back()
                back()
                pivotCounterClockwise()
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                wait(7)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                grab()
                back()
                wait(12)
                rotateCounterClockwise()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(3)
                forward()
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(3)
                forward()
                grab()
                back()
                reset()
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                pivotClockwise()
                drop()
                wait(3)
                reset()
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(9)
                forward()
                grab()
                back()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                forward()
                wait(4)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(8)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                wait(7)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                wait(7)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                forward()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
            }
        }
        )
    }
}
