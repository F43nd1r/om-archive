
solution {
    puzzle = "P074"
    name = "B S"
    arm(PISTON) {
        number = 1
        position = -2 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 7 to -1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 5 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 0 to 0
        rotation = 1
    }
    track {
        position = 6 to -1
        positions = listOf(1 to 0, 1 to -1)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    conduit {
        id = 100
        position = 7 to -3
        rotation = -1
    }
    conduit {
        id = 100
        position = -4 to 2
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(8)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                rotateClockwise()
                extend()
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
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
