
solution {
    puzzle = "P020"
    name = "B AA 6T"
    arm(PISTON) {
        number = 1
        position = -2 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(1)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                retract()
                drop()
                retract()
                reset()
            }
        }
        )
    }
}
