
solution {
    puzzle = "P091b"
    name = "B CI 7T"
    arm(PISTON) {
        number = 1
        position = 0 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 3 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 0 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -1 to -2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -3 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(1 to 0, 0 to 0, 0 to -1, 1 to -2, 1 to -1)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = -3 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = 3 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                reset()
                wait(5)
                forward()
                grab()
                forward()
                forward()
                reset()
                wait(7)
                forward()
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                extend()
                wait(2)
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
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
                pivotClockwise()
                pivotClockwise()
                wait(1)
                extend()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                extend()
                pivotClockwise()
                pivotClockwise()
                extend()
                pivotClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                forward()
                wait(5)
                forward()
                grab()
                forward()
                forward()
                reset()
                wait(1)
                forward()
                wait(5)
                forward()
                grab()
                forward()
                forward()
                extend()
                reset()
                wait(2)
                forward()
                wait(3)
                forward()
                grab()
                forward()
                forward()
                extend()
                wait(1)
                back()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(13)
                grab()
                back()
                retract()
                forward()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(9)
                extend()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                retract()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
